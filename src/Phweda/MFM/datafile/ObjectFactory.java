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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.24 at 07:22:36 PM EDT 
//


package Phweda.MFM.datafile;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.tempuri.datafile package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Year_QNAME = new QName("http://MFM.Phweda/datafile", "year");
    private final static QName _Author_QNAME = new QName("http://MFM.Phweda/datafile", "author");
    private final static QName _Date_QNAME = new QName("http://MFM.Phweda/datafile", "date");
    private final static QName _Category_QNAME = new QName("http://MFM.Phweda/datafile", "category");
    private final static QName _Version_QNAME = new QName("http://MFM.Phweda/datafile", "version");
    private final static QName _Email_QNAME = new QName("http://MFM.Phweda/datafile", "email");
    private final static QName _Url_QNAME = new QName("http://MFM.Phweda/datafile", "url");
    private final static QName _Manufacturer_QNAME = new QName("http://MFM.Phweda/datafile", "manufacturer");
    private final static QName _Homepage_QNAME = new QName("http://MFM.Phweda/datafile", "homepage");
    private final static QName _Name_QNAME = new QName("http://MFM.Phweda/datafile", "name");
    private final static QName _Description_QNAME = new QName("http://MFM.Phweda/datafile", "description");
    private final static QName _Comment_QNAME = new QName("http://MFM.Phweda/datafile", "comment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri.datafile
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Game }
     */
    public Game createGame() {
        return new Game();
    }

    /**
     * Create an instance of {@link Release }
     */
    public Release createRelease() {
        return new Release();
    }

    /**
     * Create an instance of {@link Biosset }
     */
    public Biosset createBiosset() {
        return new Biosset();
    }

    /**
     * Create an instance of {@link Rom }
     */
    public Rom createRom() {
        return new Rom();
    }

    /**
     * Create an instance of {@link Disk }
     */
    public Disk createDisk() {
        return new Disk();
    }

    /**
     * Create an instance of {@link Sample }
     */
    public Sample createSample() {
        return new Sample();
    }

    /**
     * Create an instance of {@link Archive }
     */
    public Archive createArchive() {
        return new Archive();
    }

    /**
     * Create an instance of {@link Datafile }
     */
    public Datafile createDatafile() {
        return new Datafile();
    }

    /**
     * Create an instance of {@link Header }
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Clrmamepro }
     */
    public Clrmamepro createClrmamepro() {
        return new Clrmamepro();
    }

    /**
     * Create an instance of {@link Romcenter }
     */
    public Romcenter createRomcenter() {
        return new Romcenter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "year")
    public JAXBElement<String> createYear(String value) {
        return new JAXBElement<String>(_Year_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "author")
    public JAXBElement<String> createAuthor(String value) {
        return new JAXBElement<String>(_Author_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "category")
    public JAXBElement<String> createCategory(String value) {
        return new JAXBElement<String>(_Category_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "manufacturer")
    public JAXBElement<String> createManufacturer(String value) {
        return new JAXBElement<String>(_Manufacturer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "homepage")
    public JAXBElement<String> createHomepage(String value) {
        return new JAXBElement<String>(_Homepage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/datafile", name = "comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

}
