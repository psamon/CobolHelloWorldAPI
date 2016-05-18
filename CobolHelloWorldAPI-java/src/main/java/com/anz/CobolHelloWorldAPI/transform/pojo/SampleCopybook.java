//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.18 at 02:49:58 PM AEST 
//


package com.anz.CobolHelloWorldAPI.transform.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SampleCopybook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleCopybook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Statement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FirstWord">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SecondWord">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleCopybook", propOrder = {
    "statement"
})
public class SampleCopybook {

    @XmlElement(name = "Statement", required = true)
    protected SampleCopybook.Statement statement;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link SampleCopybook.Statement }
     *     
     */
    public SampleCopybook.Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleCopybook.Statement }
     *     
     */
    public void setStatement(SampleCopybook.Statement value) {
        this.statement = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FirstWord">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SecondWord">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstWord",
        "secondWord"
    })
    public static class Statement {

        @XmlElement(name = "FirstWord", required = true, defaultValue = " ")
        protected String firstWord;
        @XmlElement(name = "SecondWord", required = true, defaultValue = " ")
        protected String secondWord;

        /**
         * Gets the value of the firstWord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstWord() {
            return firstWord;
        }

        /**
         * Sets the value of the firstWord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstWord(String value) {
            this.firstWord = value;
        }

        /**
         * Gets the value of the secondWord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondWord() {
            return secondWord;
        }

        /**
         * Sets the value of the secondWord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondWord(String value) {
            this.secondWord = value;
        }

    }

}
