# AndroidToFlutter
Mini Project to use Flutter module in your existing android project

----------------------------------------------------------------------
Create a module:- create your flutter module in directory where your android project exists
----------------------------------------------------------------------
flutter create -t module --org com.example module_name

----------------------------------------------------------------------
Create AAR:-
----------------------------------------------------------------------
flutter build aar

----------------------------------------------------------------------
Add below lines in settings.gradle:-
----------------------------------------------------------------------
setBinding(new Binding([gradle: this]))                                // new
evaluate(new File(                                                     // new
        settingsDir.parentFile,                                              // new
        'module_name/.android/include_flutter.groovy'                         // new
))                                                                     // new

include ':module_name'
project(':module_name').projectDir = new File('../module_name')

----------------------------------------------------------------------
app level build.gradle:-
----------------------------------------------------------------------
android {
  buildTypes {
    profile {
      initWith debug
    }
  }
}
dependencies {
  implementation project(':flutter')
}

----------------------------------------------------------------------
