# AlertView
A library to create simple alerts easily with some customization. Written in Kotlin but works for both Kotlin and Java

![](https://github.com/Hamadakram/AlertView/blob/master/art/Banner.png?raw=true)
## Download
Grab via Gradle:
```java
implementation 'com.irozon.alertview:alertview:1.0.0'
implementation 'com.android.support:design:27.1.0'
```
## Usage
### Kotlin
```java
val alert = AlertView("Title", "Message", AlertStyle.BOTTOM_SHEET)
alert.addAction(AlertAction("Action 1", AlertActionStyle.DEFAULT, { action ->
// Action 1 callback
}))
alert.addAction(AlertAction("Action 2", AlertActionStyle.NEGATIVE, { action ->
// Action 2 callback
}))

alert.show(this)
```
### Java
Using Lambda
```java
AlertView alert = new AlertView("Title", "Message", AlertStyle.BOTTOM_SHEET);
alert.addAction(new AlertAction("Action 1", AlertActionStyle.DEFAULT, action -> {
// Action 1 callback
}));
alert.addAction(new AlertAction("Action 2", AlertActionStyle.NEGATIVE, action -> {
// Action 2 callback
}));

alert.show(this);
```

## AlertStyle
There are three alert styles

![](https://github.com/Hamadakram/AlertView/blob/master/art/Styles.png?raw=true)
1. ```AlertStyle.BOTTOM_SHEET```
2. ```AlertStyle.IOS```
3. ```AlertStyle.DIALOG```

## AlertActionStyle
Three types of Alert Action button styles
1. ```AlertActionStyle.POSITIVE```
2. ```AlertActionStyle.NEGATIVE```
3. ```AlertActionStyle.DEFAULT```

## Themes

![](https://github.com/Hamadakram/AlertView/blob/master/art/Themes.png?raw=true)
1. ```AlertTheme.LIGHT```
2. ```AlertTheme.DARK```

Set theme by
```java
alert.setTheme(AlertTheme.DARK)
```
Default theme is LIGHT
## Authors

* **Hammad Akram** - (https://github.com/hamadakram)

## Contribution
Pull requests are welcome! Feel free to browse through open issues to look for things that need work. If you have a feature request or bug, please open a new issue so i can track it.
## Licence
```
Copyright 2018 Irozon, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
