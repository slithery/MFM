/*
 * MAME FILE MANAGER - MAME resources management tool
 * Copyright (c) 2017.  Author phweda : phweda1@yahoo.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Phweda.utils;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@SuppressWarnings({"SameParameterValue"})
public class Debug {
    private static boolean listBool = false;
    private static PrintWriter writer;
    // TODO should switch this to a lightweight queue
    private static LinkedList<String> list = new LinkedList<String>();
    private static SimpleDateFormat sdateFormat = new SimpleDateFormat("d MMM HH:mm:ss.S");
    private char separateChar = '*';
    private String separateString = "********************************************************************************";
    private OutputStream outputStream = System.out;

    public Debug() {
        this(System.out, true);
    }

    public Debug(OutputStream outputStream) {
        this(outputStream, true);
    }

    private Debug(OutputStream outputStream, boolean flush) {
        this.setOutput(outputStream, flush);
    }

    public Debug(OutputStream outputStream, boolean flush, char ch) {
        setOutput(outputStream, flush);
        this.setSeparateLineChar(ch);
    }

    /* Make PrintWriter available for outputting stacktraces to log */
    public PrintWriter Writer() {
        // Clear out the list
        flushList();
        out(""); // Force date time stamp output before printing stacktrace
        return writer;
    }

    public void out(String output) {
        if (listBool) {
            list.add("[" + sdateFormat.format(new GregorianCalendar().getTime()) + "] " + output);
        } else {
            writer.println("[" + sdateFormat.format(new GregorianCalendar().getTime()) + "] " + output);
        }
    }

    /**
     * Add to the output list to be written later
     */
    public void addToList(String output) {
        list.add("[" + sdateFormat.format(new GregorianCalendar().getTime()) + "] " + output);
    }

    /**
     * Add to the output list to be written later
     */
    public void addToList(Object output) {
        list.add("[" + sdateFormat.format(new GregorianCalendar().getTime()) + "] " + output.toString());
    }

    public void addToList(String output, boolean flush) {
        out(output);
    }

    private void flushList() {
        Iterator itor = list.listIterator(0);
        while (itor.hasNext()) {
            writer.println(itor.next());
        }
        list.clear();
    }

    public void separateLine() {
        addToList("\n" + separateString, true);
    }

    public void separateLine(char ch) {
        setSeparateLineChar(ch);
        separateLine();
    }

    public void separateLine(int num) {
        while (num-- > 0) {
            separateLine();
        }
    }

    public void setSeparateLineChar(char ch) {
        separateChar = ch;
        this.separateString = makeSeparateLineString();
    }

    private String makeSeparateLineString() {
        StringBuffer buf = new StringBuffer(80);
        for (int i = 0; i < buf.length(); i++) {
            buf.append(separateChar);
        }
        return buf.toString();
    }

    public void setOutput(OutputStream outputStream, boolean flush) {
        this.outputStream = outputStream;
        writer = new PrintWriter(outputStream, flush);
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public void setListBool(boolean listBool) {
        Debug.listBool = listBool;
    }

    // Best place in MFM code to put this
    public static String formatMillis(long nanos) {
        return String.format("%02d:%02d:%02d.%03d", TimeUnit.NANOSECONDS.toHours(nanos),
                TimeUnit.NANOSECONDS.toMinutes(nanos) % TimeUnit.HOURS.toMinutes(1),
                TimeUnit.NANOSECONDS.toSeconds(nanos) % TimeUnit.MINUTES.toSeconds(1),
                TimeUnit.NANOSECONDS.toMillis(nanos) % TimeUnit.SECONDS.toMillis(1));
    }
}

