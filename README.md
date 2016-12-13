# OneDialog-Android
##### Helps you implement a dialog in any activity in just one line of code in Android
> ### http://yashthakur1.github.io/OneDialogAndroid/ 

 ***
 
> Step 1: to Help Jump-Start Your Minimalist Journey

### Gradle addons:
```
repositories {
    maven {
        url  "http://dl.bintray.com/yashthakur1/maven"
    }
}
```
> Step 2: Adding Dependencies to your gradle

### Dependencies addons:
```
compile 'org.bitroot:onestepdialog:0.2'
```


> Step 3 (Final Step): Code Usage

### Use the libray simply by using the following code :
```
OneStepDialog.show(context, drawable true, new OneStepDialogCallback() {
            @Override
            public void btnClickYes() {
                OneStepDialog.dismissOneStepDialog();
            }

            @Override
            public void btnClickNo() {
                OneStepDialog.dismissOneStepDialog();

            }
        }, "Dialog Title", "Dialog description", "Yes", "No");
```
`Follow The Java Doc for better understanding`

## New Version Coming Soon!
