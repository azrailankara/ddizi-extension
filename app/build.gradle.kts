// use an integer for version numbers
version = 1

android {
    defaultConfig {
        // all extensions must have this enabled
        manifestPlaceholders["CLOUDSTREAM_API_KEY"] = "0123456789"
    }
}

cloudstream {
    // this is the name used in the app
    description = "DDizi.im için Cloudstream eklentisi"
    authors = listOf("keyiflerolsun")
    language = "tr"
    
    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1 // will be 3 if unspecified

    // List of video source types. Users are able to filter for extensions in a given category.
    // Set this to null to disable filtering.
    tvTypes = listOf("TvSeries")
} 