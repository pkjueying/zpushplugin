/**
 * for Log
 */
class TLogger {
    private static final String TAG = "zpush-plugin"
    private static boolean DEBUG = false

    def static enableDebug(boolean enableDebug) {
        DEBUG = enableDebug
    }

    def static info(String tag, String info) {
        if (DEBUG) {
            println "${TAG}--I--: [${tag}] ${info}"
        }
    }

    def static warn(String tag, String info) {
        println "${TAG}--W--: [${tag}] ${info}"
    }
}
