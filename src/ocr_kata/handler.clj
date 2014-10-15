(ns ocr-kata.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [name] 
    (cond 
      (nil? name) "Put your name in the url, like, you know, ?name=Lola"
      :else (str "Hello, " name)))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
