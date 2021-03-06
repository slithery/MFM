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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: Phweda
 * Date: 11/25/2015
 * Time: 4:23 PM
 */
public class Pastie {

    private static String PASTIE_BASE_URL = "http://pastie.org/private/";
    private static Pattern pattern = Pattern.compile("download\\?key=(.+?)\"");

    public String postText(String text) throws IOException {

        // int 6 is the Pastie value for Text post see
        String response = shareAndGetResponse(text, 6);
        String pastedCodeFragmentUniqueKey = extractKeyFrom(response);

        return PASTIE_BASE_URL + pastedCodeFragmentUniqueKey;
    }

    private String shareAndGetResponse(String selection, int languageDropdownId) throws IOException {
        URL url = new URL("http://pastie.org/pastes");
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setDoOutput(true);
        OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());

        String data = "paste[parser_id]=" + languageDropdownId +
                "&paste[authorization]=burger&paste[restricted]=1&paste[body]=" + URLEncoder.encode(selection, "UTF-8");
        writer.write(data);
        writer.flush();
        writer.close();

        StringBuffer answer = loadResponse(conn);
        return answer.toString();
    }

    private StringBuffer loadResponse(URLConnection conn) throws IOException {
        StringBuffer answer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            answer.append(line);
        }
        reader.close();
        return answer;
    }

    private String extractKeyFrom(String response) {
        Matcher matcher = pattern.matcher(response);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new RuntimeException("Sorry. Plugin wasn't able to extract url to pasted code fragment.");
    }

}
