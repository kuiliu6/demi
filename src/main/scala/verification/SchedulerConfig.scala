
package akka.dispatch.verification

case class SchedulerConfig(
  messageFingerprinter      : FingerprintFactory=null,
  enableFailureDetector     : Boolean=false,
  enableCheckpointing       : Boolean=false,
  shouldShutdownActorSystem : Boolean=true,
  filterKnownAbsents        : Boolean=true,
  invariant_check           : Option[TestOracle.Invariant]=None,
  ignoreTimers              : Boolean=false
)