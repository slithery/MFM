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
// Generated on: 2016.10.13 at 02:11:20 PM EDT 
//


package Phweda.MFM.mame;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="player" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buttons" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reqbuttons" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minimum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maximum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sensitivity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keydelta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reverse" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ways" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ways2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ways3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "control")
public class Control implements Serializable {

    private static final long serialVersionUID = 4579069383521454573L;

    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "player")
    protected String player;
    @XmlAttribute(name = "buttons")
    protected String buttons;
    @XmlAttribute(name = "reqbuttons")
    protected String reqbuttons;
    @XmlAttribute(name = "minimum")
    protected String minimum;
    @XmlAttribute(name = "maximum")
    protected String maximum;
    @XmlAttribute(name = "sensitivity")
    protected String sensitivity;
    @XmlAttribute(name = "keydelta")
    protected String keydelta;
    @XmlAttribute(name = "reverse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reverse;
    @XmlAttribute(name = "ways")
    protected String ways;
    @XmlAttribute(name = "ways2")
    protected String ways2;
    @XmlAttribute(name = "ways3")
    protected String ways3;

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the player property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlayer(String value) {
        this.player = value;
    }

    /**
     * Gets the value of the buttons property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getButtons() {
        return buttons;
    }

    /**
     * Sets the value of the buttons property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setButtons(String value) {
        this.buttons = value;
    }

    /**
     * Gets the value of the reqbuttons property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReqbuttons() {
        return reqbuttons;
    }

    /**
     * Sets the value of the reqbuttons property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReqbuttons(String value) {
        this.reqbuttons = value;
    }

    /**
     * Gets the value of the minimum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMinimum(String value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaximum(String value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the sensitivity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSensitivity(String value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the keydelta property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKeydelta() {
        return keydelta;
    }

    /**
     * Sets the value of the keydelta property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKeydelta(String value) {
        this.keydelta = value;
    }

    /**
     * Gets the value of the reverse property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReverse() {
        if (reverse == null) {
            return "no";
        } else {
            return reverse;
        }
    }

    /**
     * Sets the value of the reverse property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReverse(String value) {
        this.reverse = value;
    }

    /**
     * Gets the value of the ways property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWays() {
        return ways;
    }

    /**
     * Sets the value of the ways property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWays(String value) {
        this.ways = value;
    }

    /**
     * Gets the value of the ways2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWays2() {
        return ways2;
    }

    /**
     * Sets the value of the ways2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWays2(String value) {
        this.ways2 = value;
    }

    /**
     * Gets the value of the ways3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWays3() {
        return ways3;
    }

    /**
     * Sets the value of the ways3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWays3(String value) {
        this.ways3 = value;
    }

}
