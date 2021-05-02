# testmvvm

    // viewmodel, livedata
    def lifecycle_version = "2.3.1"

    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"

    // Retrofit2
    def retrofit_version = "2.9.0"
    def logging_version = "4.3.1"

    implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"
    implementation "com.squareup.okhttp3:okhttp:$logging_version"
    implementation "com.squareup.okhttp3:logging-interceptor:$logging_version"

    // room database
    def room_version = '2.3.0'

    implementation "androidx.room:room-runtime:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
    implementation "androidx.room:room-ktx:$room_version"


    //facebook stetho for debug
    def stetho_face_version = '1.5.1'

    implementation "com.facebook.stetho:stetho:${stetho_face_version}"
    implementation "com.facebook.stetho:stetho-okhttp3:${stetho_face_version}"

    // timber for printing logs
    def timber_version = "4.7.1"
    implementation "com.jakewharton.timber:timber:$timber_version"