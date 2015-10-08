(ns qa-report.devtools_panel
  (:require [khroma.log :as console]
            [dommy.core :as dommy :refer-macros [sel sel1]]))

(defn- trigger-btn-handler [e]
  (let [trigger-btn (sel1 :#trigger-btn)]
    (if (dommy/has-class? trigger-btn "btn-success")
        (-> trigger-btn
          (dommy/add-class! :btn-danger)
          (dommy/set-text! "Stop")
          (dommy/remove-class! :btn-success))
        (-> trigger-btn
          (dommy/remove-class! :btn-danger)
          (dommy/add-class! :btn-success)
          (dommy/set-text! "Start")))))


(defn init []
  (let [trigger-btn (sel1 :#trigger-btn)]
    (dommy/listen! trigger-btn :click trigger-btn-handler)))
