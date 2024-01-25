R is free.
R is open source. 
R is case sensitive. 

`ls()`: get list of the variables that has been defined, if no characters has been defined it gives `character(0)`
`getwd()`: used to get the working directory:
`setwd(dir = "C:/Users/Downaload`: This sets working directory
`rm(list = ls())` = removes all variables defined. 
`#` is used for comments
`summary(x)`: generates the summary
`mean(x)`: finds the mean of the data
`median(x)`: finds the median
`read.table('mydata.txt',hearder=TRUE)`: load text file
myData = read.table('mydata.txt',hearder=TRUE) 
fix(myData) : shows editable table
x = seq(1,10,length=10): generates a sequence of x: function is used to generate sequences of numbers. It creates a sequence of numbers with a specified start, end, and interval. The basic syntax of the `seq()` function is as follows:

cor(x) correlation matrix of x if it is a matrix or a data frame (1 if x is a vector)


function in R using the following syntax
```R
functionname = function(argument1,argument2) {equation}
f = function(x,y) {x+y}
f(2,3);f(1.5,-.0.7);f(4,10)
#semi-colon can be used as separator between equations
```

You can specify the default value for an argument, then the argument is considered optional
```R
g = function(x,y=10){x+y}
g(1) 
#11

```

In a function, you may use the `return` keyword to specify the value returned by the function. Though it is common to omit it since R will simply return the last evaluated expression by default. 

```R
q = function(x){return(x^2 + 3)}
```

`length`: To find the length of a vector
`sum`: To find the sum of all elements in the vector

```R
#finding mean:
x = c(1,2,3,4,5)
vectorMean = function(x) {sum(x) / length(x)}

vectorMean(x)

#using built-in function
mean(x)
```

`all.equal(value1,value2)`: is used to compare between two values. Returns `True` if they are the same and `False` if they arent

```R
# This function takes in x(a set of data) and y (another set of data) as input, returns the mean of x minus mean of y
x = c(1,2,4,5,6)
y = c(2,4,6,7,8)
meanDiff = function(x,y){a = mean(x) - mean(y); return(a)}
meanDiff(x,y)

```

To return concatenated text, replace return with `cat()`
```R
mx = function(x){
x = x + 5
cat("The new x is:", x)
}
```


Geometric Mean can be calculated using this formula
![[Pasted image 20240117175942.png]]
or
![[Pasted image 20240117175957.png]]
```R
geometric = function(x){exp(mean(log(x)))}
geometric(x)
```
to generate random number:
```R
z = runif(count,minimum,maximum)
z = runif(50,0,3)
```

--- 
Loops in R

for loop
```R
for(i in 1:10){
print(i+1)
}
```

`rep(number,count)`: repeats the number a given amount of time

```R
rep(0,100) #repeats 0 100 time
```

```R
x = 1:10
y = 30:40
z= rep(0,10)
print(x)
print(y)
print(z)
for(i in 1:10){
	z[i] = x[i] + y[i]
}
print(z)

w = x + y

print(w)

all.equal(w,z)
```

nested for loop
```R
for(i in 1:10){
	for(j in 1:5){
	cat("i: ",i," j: ",j)
	}
}
```

if statements
```R
for(i in 1:10){
	if(i == 4){
	print(i)
	}
}
```


While loop:
While is similar to for loop, but it executes continuously until the condition is no longer met

```R
i = 1
while(i<10){
	print(i)
	i = i + 1
}

---

i = 1
if(i<10){
print(i)
i = i + 1
}
```

---

```R
geometric = function(x) {
  if(!is.numeric(x)) stop ("Input must all be numeric")
  if(min(x) <= 0 ) stop ("Input must be greater than zero")
  
  exp(mean(log(x)))
}
x = c("a","b","c")
y = c(1,2,3,4)
geometric(y)
geometric(x)

```

sum(x)
prod (x)
max(x)
min(x)
which. max (x)
which. min (x)
range (x)
length (x)
mean (x)
median (x)
var(x) or cov(x)
cor(x)
var(x,
cor (x ,
y) or cov(x,
y)
y)
sum of thc elements of x
product of thc elements of x
maximum of thc elements of x
minimum of thc elements of x
returns thc index of thc greatest clement of x
returns thc index of thc smallest clement of x
id. than c (min(x), max(x))
number of elements in x
mean of the elements of x
median of thc elements of x
variance of the elements of x calculated on n — 1); if x is
a matrix or a data frame, thc variance-covariance matrix is
calculated
correlation matrix of x if it is a matrix or a data frame (1 if x
is a vector)
covariance between x and y, or between thc columns of x and
those of y if they arc matrices or data frames
linear correlation between x and y, or correlation matrix if they
are matrices or data frames