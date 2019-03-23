(defproject ie.zeto/clj-soap "0.3.2"
  :description "SOAP Client and Server using Apache Axis2."
  :wsdl "https://github.com/sbreatnach/clj-soap"
  :license {:name "Eclipse Public License"
            :wsdl "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.logging "0.4.1"]
                 [org.clojure/data.xml "0.2.0-alpha6"]
                 [clj-time "0.15.0"]
                 [org.apache.axis2/axis2-adb "1.7.9"]
                 [org.apache.axis2/axis2-transport-http "1.7.9"]
                 [org.apache.axis2/axis2-transport-local "1.7.9"]
                 [org.apache.axis2/axis2-jaxws "1.7.9"]
                 [xalan/xalan "2.7.2"]
                 [commons-logging/commons-logging "1.2"]]
  :source-paths ["src" "test"]
  :aot [clj-soap.server-test])

