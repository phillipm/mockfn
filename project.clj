(defproject mockfn "0.3.0"
  :description "A library for mocking Clojure functions."
  :url "https://github.com/pmatiello/mockfn"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:dependencies [[nubank/matcher-combinators "0.4.1"]]}})
