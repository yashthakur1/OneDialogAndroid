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

## License

```	
 The MIT License (MIT)

 Copyright (c) 2016 Yash Thakur

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
```
