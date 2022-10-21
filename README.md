# ECN - European Cricket Network - Android
​
The Android Version of European Cricket Network.
The digital home of European cricket
Catch live streams, news, players, scores, stats and updates from across European cricket
​
## Getting Started
​
You will need a laptop/desktop(OS doesn't matter) to run this application for development. You will also need the latest version of Android Studio(development s/w for Android). You can run the application on a device/simulator from Android Studio.
​
### Prerequisites
​
You will require the following things to run the app successfully.
​
Windows, Mac, Linux or ChromeOS
Android Studio
Android SDK
Physical or Virtual Device(Emulator)
​
### Installing
​
To get started, download Android Studio into your system from the [Android Developers Link](https://developer.android.com/studio)
​
You also need to download the sdk required by the Android studio for your development purpose.Link:- https://developer.android.com/studio/releases/platform-tools
​
You should now be able to run the app on the simulator or any testing device.
​
### Publishing App
When you are ready to publish your app, you need to sign your app and upload it to an app store, such as Google Play Console
* Generate an upload key and keystore - If you don't already have an upload key, which is useful when opting in to App signing by Google Play, you can generate one using Android Studio as follows:
1. In the menu bar, click Build > Build > Generate Signed Bundle/APK.
2. In the Generate Signed Bundle or APK dialog, select Android App Bundle or APK and click Next.
3. Below the field for Key store path, click Create new.
4. On the New Key Store window, provide - Key store path, Key store password, Key alias, Key password, Validity (years), Certificate ( Enter some information about yourself for your certificate )
5. Once you complete the form, click OK.
* Sign your app with your key
  
1. If you don’t currently have the Generate Signed Bundle or APK dialog open, click Build > Generate Signed Bundle/APK.
2. In the Generate Signed Bundle or APK dialog, select either Android App Bundle or APK and click Next.
3. Specify the path to your keystore, the alias for your key, and enter the passwords for both.
4. Click Next.
5. In the next window select a destination folder for your signed app, select the build type, choose the product flavor(s) if applicable.
6. If you are building and signing an APK, you need to select which Signature Versions you want your app to support.
7. Click Finish.
​
## Deployment
​
For deployment, you need to first generate a signed apk using the project's app keystore and password. After that upload the signed apk to the Playstore console. 
Please refer the [Code review checklist](https://docs.google.com/spreadsheets/d/1aua4mUQQsQe2i8B1C6wDl3MA4LUEBvCpbzBufvP7TZA/edit#gid=69977304) before any deployment.
​
** Key Store Details **
keystore alias: ecn_android_app
keystore password: $p0rtz
​
## Built With
​
* [Kotlin/Java](https://developer.android.com/kotlin) - The programming language used
* [Android Studio](https://developer.android.com/studio) - The IDE used
​
​
## Versioning
​
The project is hosted on the [ECN(wm-ecn-android) Repository](https://github.com/sportzinteractive/wm-ecn-android) of [Sportz Interactive](https://github.com/sportzinteractive).
The latest production code can be found on the [master](https://github.com/sportzinteractive/wm-ecn-android) branch.
Check out [All branches](https://github.com/sportzinteractive/wm-ecn-android/branches) if you are looking for specific features.
Please create a new feature branch for any updated features being developed.
​
## Authors
​
* **Jay Karmokar** - *Lead Developer* - [Sportz Interactive](https://github.com/sportzinteractive)
​
See all the [developers](https://github.com/sportzinteractive/wm-ecn-android/graphs/contributors) who contributed to this project.

