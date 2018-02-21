# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile


-dontwarn com.squareup.okhttp.**
-dontwarn okio.**
-dontwarn retrofit2.**
-dontwarn rx.**
-dontwarn com.liulishuo.filedownloader.**
-dontwarn com.thoughtworks.xstream.**

-keep class com.imscs.barcodemanager.**{*;}
-keep class com.mobilead.$*{*;}

-keep class com.langfen.zhjmaho.zhiqirailwaycheck.base.**{*;}

-keep class com.thoughtworks.xstream.**{*;}
-keep class android.support.v7.widget.LinearLayoutManager {
    public protected *;
}
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
    **[] $VALUES;
    public *;
}
-keep class com.squareup.okhttp.** { *; }
-keep interface com.squareup.okhttp.** { *; }
-keep class retrofit2.** { *; }
-keep class com.liulishuo.filedownloader.**{*;}

-keepattributes *Annotation*,Signature,Exceptions

-keepclasseswithmembers class * {
    @retrofit.http.* <methods>;
}
-keep class com.bumptech.glide.GeneratedAppGlideModuleImpl
-dontwarn org.apache.poi.**
-keep class org.apache.poi.**{*;}

-dontwarn com.langfen.zhjmaho.xmltoform.**
-keep class com.langfen.zhjmaho.xmltoform.**{*;}

-keep class de.greenrobot.dao.** {*;}
-keepclassmembers class * extends de.greenrobot.dao.AbstractDao {
    public static java.lang.String TABLENAME;
}
-keep class **$Properties

-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.module.AppGlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
    **[] $VALUES;
    public *;
}

-dontwarn okhttp3.**
-dontwarn okio.**
-dontwarn javax.annotation.**
-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase