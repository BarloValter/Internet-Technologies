package ua.nure.sherbakov.practice7.constants;

public final class Constants {
	// files
	// TODO remove in production
	public static final String VALID_XML_FILE = "input1.xml";
	public static final String INVALID_XML_FILE = "input-invalid.xml";
	public static final String XSD_FILE = "input.xsd";

	public static final String OUTPUT_DOM_XML_FILE = "output.dom.xml";
	public static final String OUTPUT_SAX_XML_FILE = "output.sax.xml";
	public static final String OUTPUT_STAX_XML_FILE = "output.stax.xml";
	
	// this package contains jaxb entities. To get entities use the following
	// command: xjc Test.xsd -p PACKAGE_FOR_ENTITIES -d YOUR_SRC_FOLDER
	public static final String JAXB__PACKAGE = " ua.nure.sherbakov.practice7.entity";

	// default encoding
	// public static final String ENCODING_DEFAULT = "UTF-8";

	// your own namespace
	public static final String MY_NS__URI = "http://sherbakov.nure.ua/practice7/entity";
	public static final String MY_NS__PREFIX = "tns";

	// for schema location
	public static final String SCHEMA_LOCATION__URI = "http://sherbakov.nure.ua/practice7/entity input.xsd";
	public static final String SCHEMA_LOCATION__ATTR_NAME = "schemaLocation";
	public static final String SCHEMA_LOCATION__ATTR_FQN = "xsi:schemaLocation";
	public static final String XSI_SPACE__PREFIX = "xsi";

	// validation features
	public static final String FEATURE__TURN_VALIDATION_ON = "http://xml.org/sax/features/validation";
	public static final String FEATURE__TURN_SCHEMA_VALIDATION_ON = "http://apache.org/xml/features/validation/schema";

	// full qualified names of classes
	public static final String CLASS__XERCES_SAX_PARSER = "org.apache.xerces.parsers.SAXParser";
	public static final String CLASS__DOCUMENT_BUILDER_FACTORY_INTERNAL = "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl";
	public static final String CLASS__SAX_PARSER_FACTORY_INTERNAL = "com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl";
	public static final String CLASS__XML_SCHEMA_FACTORY_INTERNAL = "com.sun.org.apache.xerces.internal.jaxp.validation.XMLSchemaFactory";
}