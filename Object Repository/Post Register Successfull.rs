<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Email value taken from GET single user response</description>
   <name>Post Register Successfull</name>
   <tag></tag>
   <elementGuidId>ed9e4ff3-e4e0-4f06-9dab-4b536d532482</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;data\&quot;: {\n        \&quot;email\&quot;: \&quot;sharif.ridho@gmail.com\&quot;,\n        \&quot;first_name\&quot;: \&quot;Syarif\&quot;,\n        \&quot;last_name\&quot;: \&quot;Ridho\&quot;,\n        \&quot;avatar\&quot;: \&quot;https://reqres.in/img/faces/2-image.jpg\&quot;\n    },\n    \&quot;support\&quot;: {\n        \&quot;url\&quot;: \&quot;https://reqres.in/#support-heading\&quot;,\n        \&quot;text\&quot;: \&quot;Hello im position QA Engineer!\&quot;\n    }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>c0918723-39f8-43ec-b33c-4445ce61b5c6</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.baseURL}/api/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
