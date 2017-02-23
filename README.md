# Toasty
[![API](https://img.shields.io/badge/API-9%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=9) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Toasty-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/5102) [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=XUUEWEHJYFYV2)



The usual Toast, but with steroids. **(Screenshots at the end of the file.)**

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```


Dependency
--

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	compile 'com.github.lifanly000:MyToast:1.0'
}
```


Usage
--

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

To display an error Toast:

``` java
Toasty.error(yourContext, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
```
To display a success Toast:

``` java
Toasty.success(yourContext, "Success!", Toast.LENGTH_SHORT, true).show();
```
To display an info Toast:

``` java
Toasty.info(yourContext, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
```
To display a warning Toast:

``` java
Toasty.warning(yourContext, "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
```
To display the usual Toast:

``` java
Toasty.normal(yourContext, "Normal toast w/o icon").show();
```
To display the usual Toast with icon:

``` java
Toasty.normal(yourContext, "Normal toast w/ icon", yourIconDrawable).show();
```

You can also create your custom Toasts with the `custom()` method:
``` java
Toasty.custom(yourContext, "I'm a custom Toast", yourIconDrawable, textColor, tintColor, duration, withIcon, true).show();
```

You can control the position of the toast on the sceen by the `gravity`  parameter :

```
Toasty.normal(MainActivity.this, "Normal toast w/ icon", Toast.LENGTH_LONG,icon,true,Gravity.CENTER).show();
```

You can control relative position of ICONS and text by the `horizonMode`  parameter :

```
Toasty.normal(MainActivity.this, "Normal toast w/ icon", Toast.LENGTH_LONG,icon,true,Gravity.CENTER,Toasty.TOASTY_VERTICAL).show();
```

If you want to control everything , please see the follow method:

```
 /**
     *
     * @param context           context
     * @param message           message
     * @param icon              your icon
     * @param textColor         textColor
     * @param tintColor         backGround Color
     * @param duration          time duration
     * @param withIcon          true : your own icon   false : default icon
     * @param shouldTint        true : your tint       false : defalt tint
     * @param gravity           locaiton :Gravity.Center /  Gravity.Bottom   and so on .
     * @param horizonMode       The relative position of ICONS and text:  Toasty.TOASTY_VERTICAL / Toasty.TOASTY_HORIZONTAL
     * @return
     */
    public static @CheckResult Toast custom(@NonNull Context context, @NonNull String message, Drawable icon,
                               @ColorInt int textColor, @ColorInt int tintColor, int duration,
                               boolean withIcon, boolean shouldTint,int gravity,int horizonMode) {...}
```





There are variants of each method, feel free to explore this library.


Apps using Toasty
--

Want to be here? Open an `issue` or make a `pull request`.

<table>
	<tr>
	<td><img src="https://lh3.googleusercontent.com/vmch41lYF_TKb1MKgtYrSgz2rKQ4T1EnGRCGpWSMqLRSzi_pgNWoZpw9WJE8UV4t614=w300-rw" width="64"/></td>
	<td><a href="https://play.google.com/store/apps/details?id=com.trivisionzero.chromophoto">ChromoPhoto - Colorize B&W</a></td>
</table>


Screenshots
--

<img src="/art/scr1.png" width="250">
<img src="/art/scr2.png" width="250">
<img src="/art/scr3.png" width="250">
<img src="/art/scr4.png" width="250">
<img src="/art/scr5.png" width="250">

<img src="/art/scr6.png" width="250">

<img src="/art/sr7.png" width="250">

