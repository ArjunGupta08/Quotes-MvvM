# Quotes MvvM Apllication For Beginners

This application is based on the concept of `ViewModel` and `ViewModelFactory`. 

- First add the `ViewModel` dependency to use the concepts of ViewModel

       implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
- In this application we are going to deal with a json file, this json file will contain all the quotes, so to use the json file in Android Studio we need to add one more dependency for json.

       implementation 'com.google.code.gson:gson:2.10.1'
- Now you are all set to go ahead

# Implemented UI Testing using Espresso
- Espresso Test SetUp
  
           testImplementation 'junit:junit:4.13.2'
           // AndroidJUnitRunner and JUnit Rules
           androidTestImplementation("androidx.test:runner:1.5.2")
           androidTestImplementation("androidx.test:rules:1.5.0")
       
           androidTestImplementation ("androidx.test.ext:junit:1.1.5")
           androidTestImplementation ("androidx.test.ext:junit-ktx:1.1.5")
           androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
           androidTestImplementation ("androidx.test.espresso:espresso-intents:3.5.1")

  - Testing UI Logic for previous and Next Buttons
