# Definition
* SSL =
* TLS =
* JKS = 

# Prerequisite
1. Keytool is part of the Java SDK. We can find it in Java SDK directory e.g. C:\Program Files\Java\jdk1.6.0_14\bin
2. [KeyStore Explorer(KSE) installation](https://keystore-explorer.org/downloads.html)


# Commands
* $ keytool -list -v -keystore [jks_file_name]
* $ keytool -list -v -keystore kafka.keystore.jks
* $ keytool -genkey -v -keystore myapp.keystore -alias myapp === To generate Self Signed Certificate
* $ keytool -genkey -v -keystore myapp.jks -alias myapp
* $ keytool -genkey -alias https-example -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore https-example.jks
* $ keytool -importkeystore -srckeystore myapp.jks -destkeystore myapp.jks -deststoretype pkcs12 === To migrate to PKCS12 format

# Terminology
* SSL = Secure Sockets Layer
* TLS = Transport Layer Security
* JKS = Java Key Store
* HTTPS is HTTP sent over an SSL encrypted connection
* keystores =
* truststores = 
* private key = 
* public certificate = 
* File types = .cer  , .p12  , .jks
* PKCS12 is Default keystore type
* Default keystore type = keystore.type=pkcs12
* In a SSL handshake the purpose of trustStore is to verify credentials and the purpose of keyStore is to provide credential
* One Way SSL , Two Way SSL
* .pem = (Privacy-enhanced Electronic Mail) Base64 encoded DER certificate, enclosed between "-----BEGIN CERTIFICATE-----" and "-----END CERTIFICATE-----"
* .cer, .crt, .der = usually in binary DER form, but Base64-encoded certificates are common too (see .pem above)
* .p7b, .p7c = PKCS#7 SignedData structure without data, just certificate(s) or CRL(s)
* .p12 = PKCS#12, may contain certificate(s) (public) and private keys (password protected)
* .pfx = PFX, predecessor of PKCS#12 (usually contains data in PKCS#12 format, e.g., with PFX files generated in IIS)
* .pem file is Private Key

# SSL Certificates Type
1. Private Certificate / File -- KeyStore
2. Public Certificate / File -- TrustStore
3. Self Signed Certificate / File -- 


# File Types & Usage
|SNo| #File Type  | #Usage |
| :--- | :--- | :--- |
|1 | .pem file<br> ec2_key_pair.pem | Its Private Key| 
|2 | .ppk file<br> ec2_key_pair.pem | | 
|3 | .jks file<br> itt_keystore.jks <br>itt_truststore.jks | | 
|4 | .cer, .crt, .der | | 
|5 | .p12 | |
|6 | .pfx | |

# Files
1. key.pem = Private key in PEM format
2. pkcs8.pem = Private key, Public key, Certificate
3. public.pem = Public key in PEM format

# Reference
* [Spring Boot SSL GitHub example](https://github.com/mkyong/spring-boot/tree/master/spring-boot-ssl)
* [trustStore VS keyStore in Java](https://www.geeksforgeeks.org/difference-between-truststore-and-keystore-in-java/)  
* [How to add or list certificates from keystore or trustStore in Java](https://javarevisited.blogspot.com/2012/03/add-list-certficates-java-keystore.html#axzz7DEFkCZ2t) 
* [Difference between trustStore and keyStore in Java](https://javarevisited.blogspot.com/2012/09/difference-between-truststore-vs-keyStore-Java-SSL.html#axzz7DEFkCZ2t) 
* [Download PuTTY](https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html)
* [KSE Releases on GitHub](https://github.com/kaikramer/keystore-explorer/releases)

# Image
1. How HTTPS works?
* ![image](https://github.com/sanjeevkomma/Spring-Boot/assets/7721150/2baadb01-e634-4492-b2bf-2d60219d85f7)


