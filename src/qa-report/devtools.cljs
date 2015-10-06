(ns qa-report.devtools
  (:require [khroma.log :as console]
            [khroma.runtime :as runtime]
            [cljs.core.async :refer [>! <!]])
  (:require-macros [cljs.core.async.macros :refer [go]]))


;; (defn devtools_create_panel [props callback]
;; )

(defn init []
  (.create js/chrome.devtools.panels
    "QA Report" "icon48.png" "devtools-panel.html" (fn [panel] :default)))
