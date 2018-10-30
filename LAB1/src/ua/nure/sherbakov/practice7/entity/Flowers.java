//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.10.14 at 01:38:45 PM CEST 
//

package ua.nure.sherbakov.practice7.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Flower" type="{http://sherbakov.nure.ua/practice7/entity}Flower" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "flower" })
@XmlRootElement(name = "Flowers")
public class Flowers {

	@XmlElement(name = "Flower", required = true)
	protected List<Flower> flowers;

	/**
	 * Gets the value of the flower property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the flower property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFlower().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Flower }
	 * 
	 * 
	 */
	public List<Flower> getFlowers() {
		if (flowers == null) {
			flowers = new ArrayList<Flower>();
		}
		return flowers;
	}

	@Override
	public String toString() {
		if (flowers == null || flowers.size() == 0)
			return "Flowers contains no flower\n";
		StringBuilder result = new StringBuilder().append("\n");
		int i = 1;
		for (Flower flower : flowers)
			result.append("Flower: " + i++ + "\n").append(flower).append("\n");
		return result.toString();
	}
}