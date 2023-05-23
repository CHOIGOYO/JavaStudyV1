# 문자, 문자열 리터럴 그리고 문자열 결합
<hr>

### 문자
문자는 단일한 문자를 나타내는 데이터 타입입니다. 자바에서 문자는 ```char``` 데이터 타입으로 표현되며, 작은따옴표 ```''```로 감싸서 표기합니다.
```java
char c = 'A';
System.out.println(c); // 출력: A

char c1 ='AB'; // 에러
```

<hr>

### 문자열
문자열은 여러 개의 문자로 구성된 데이터 타입입니다. 자바에서 문자열은 ```String``` 클래스로 표현되며, 큰따옴표 ```""```로 감싸서 표기합니다.
```java
String str = "Hello";
System.out.println(str); // 출력: Hello
```

<hr>
문자열은 연속된 여러 문자로 볼 수 있습니다.

```java
String s = "A";
String s1 = ""; // 허용
char = ''; // 에러
```
<hr>

### 문자열 결합
1. 문자열과 문자열 결합 : 두 개의 문자열을 결합하여 새로운 문자열을 생성합니다.
```java
String str1 = "Hello";
String str2 = "World";
String result = str1 + str2;
System.out.println(result); // 출력: HelloWorld
```
<br>

2. 문자열과 다른 데이터 타입 결합: 문자열과 다른 데이터 타입(정수, 실수, 문자 등)을 결합할 때 자바는 자동으로 해당 데이터를 문자열로 변환하여 결합합니다.
```java
String name = "John";
int age = 25;
String message = "My name is " + name + " and I am " + age + " years old.";
System.out.println(message); // 출력: My name is John and I am 25 years old.
```
<br>
즉, 
```문자열``` + ```any type```  =  ```문자열``` <br>
```any type```+```문자열``` =  ```문자열``` <br>
<br>
<br>

3. 문자열과 변수 결합: 변수의 값을 문자열과 결합할 수 있습니다.
```java
int number = 42;
String text = "The number is " + number;
System.out.println(text); // 출력: The number is 42
```