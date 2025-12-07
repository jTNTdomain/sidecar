(ns sidecar.core)

;; This is the general sidecar entrypoint.
;; Agents may call (sidecar.core/run-all) to run any regression harnesses.
;; You can extend this over time.

(defn run-all []
  (println "[sidecar] Nothing to run yet. Core harness is empty.")
  {:status :ok :message "No sidecar checks implemented yet."})

