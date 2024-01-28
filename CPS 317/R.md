### Basic Information about R:

- R is free and open source.
- R is case-sensitive.

### Common Commands:

#### Workspace and Variables:

- `ls()`: Get a list of defined variables. Returns `character(0)` if no variables are defined.
- `getwd()`: Get the working directory.
- `setwd(dir = "C:/Users/Download")`: Set the working directory.
- `rm(list = ls())`: Remove all defined variables.
- `#`: Used for comments.

#### Summary Statistics:

- `summary(x)`: Generate a summary of variable x.
- `mean(x)`: Find the mean of data x.
- `median(x)`: Find the median of data x.

#### Reading and Manipulating Data:

- `read.table('mydata.txt', header=TRUE)`: Load a text file.
- `myData = read.table('mydata.txt', header=TRUE)`: Assign loaded data to a variable.
- `fix(myData)`: Show an editable table.

#### Generating Sequences:

- `x = seq(1, 10, length=10)`: Generate a sequence of 10 numbers from 1 to 10.

### Statistical Functions:

- `sum(x)`: `sum` of the elements of x
- `prod(x):` `product` of the elements of x
- `max(x)`: `maximum` of the elements of x
- `min(x)`: `minimum` of the elements of x
- `length(x)`: `length` of x
- `mean(x)`: `mean` of the elements of x
- `median(x)`: `median` of the elements of x
- `var(x)` or `cov(x)`: `variance` of the elements of x calculated on n-1 (if x is a matrix or data frame, the variance-covariance matrix is calculated)
- `cor(x)`: `correlation` matrix of x if it is a matrix or a data frame (1 if x is a vector)
- `var(x, y)` or `cov(x, y)`: `covariance` between x and y, or between the columns of x and those of y if they are matrices or data frames
- `cor(x,y):` linear correlation` between x and y, or correlation matrix if they are matrices or data frames
#### Descriptive Statistics:

- `cor(x)`: Correlation matrix of x if it's a matrix or data frame.
- `cor(x, y)`: Correlation between x and y.
- `cov(x, y)`: Covariance between x and y.

#### Quantiles:

```R
# Calculate quartiles
q1 <- quantile(data, 0.25)
q2 <- quantile(data, 0.5)  # Median
q3 <- quantile(data, 0.75)

# Print the results
cat("Q1 (25th percentile):", q1, "\n")
cat("Q2 (50th percentile - Median):", q2, "\n")
cat("Q3 (75th percentile):", q3, "\n")
```

#### Z-Scores:

```R
# Calculate z-scores
z_scores <- scale(data)

# Print the z-scores
cat("Z-Scores:\n")
print(z_scores)
```

#### T-Test:

```R
# Perform a t-test
t_test_result <- t.test(data)

# Print the t-test result
cat("T-Test Result:\n")
print(t_test_result)

# Extract the t-value 
t_value <- t_test_result$statistic
```

#### Shapiro-Wilk Test:

```R
#Used to test for normality


# Example with a dataset named 'data'
data <- c(2, 3, 5, 7, 11, 13, 17, 19, 23)

# Shapiro-Wilk test
shapiro.test(data)
```

### Functions in R:

#### Basic Function:

```R
f = function(x, y) {x + y}
f(2, 3); f(1.5, -0.7); f(4, 10)
```

#### Function with Default Argument:

```R
g = function(x, y = 10) {x + y}
g(1) # Outputs 11
```

#### Function with Return Statement:

```R
q = function(x) {return(x^2 + 3)}
```

### Common Built-in Functions:

- `length(x)`: Find the length of a vector.
- `sum(x)`: Find the sum of all elements in the vector.

#### Comparison Function:

- `all.equal(value1, value2)`: Compare two values. Returns `TRUE` if they are the same and `FALSE` if they aren't.

### Geometric Mean:

```R
geometric = function(x) {exp(mean(log(x)))}
geometric(x)
```

### Random Number Generation:

```R
runif(count, minimum value, maximum value)
z = runif(50, 0, 3)
```

### Loops in R:

#### For Loop:

```R
for(i in 1:10) {
  print(i + 1)
}
```

#### Repetition with `rep`:

```R
rep(0, 100) # Repeats 0 100 times
```

#### Nested For Loop:

```R
for(i in 1:10) {
  for(j in 1:5) {
    cat("i:", i, " j:", j)
  }
}
```

#### If Statements:

```R
for(i in 1:10) {
  if(i == 4) {
    print(i)
  }
}
```

#### While Loop:

```R
i = 1
while(i < 10) {
  print(i)
  i = i + 1
}
```

### Error Handling:

```R
geometric = function(x) {
  if (!is.numeric(x)) stop("Input must all be numeric")
  if (min(x) <= 0) stop("Input must be greater than zero")
  
  exp(mean(log(x)))
}
```
---
```R
# Initialize vector x
x = c(1,2,3,4,5,6,7,8,9)
# Assign values from vector y to x where x is less than 5
x[x < 5] = y[x < 5]
# Print vector x
print(x)
```
Explanation:
- `x` is initialized as a vector with values from 1 to 9.
- Values in `x` less than 5 are replaced with corresponding values from vector `y`.
- The modified `x` is then printed.
```R
# Sort vector y (Note: Sorting does not modify the original vector)
sort(y)
# Rank vector y
rank(y)
# Order vector y and store the order in 'o'
o = order(y)
# Access vector y using the order 'o'
y[o]
```
Explanation:
- Sorting `y` does not modify the original vector; it just returns a sorted version.
- `rank(y)` calculates the rank of each element in `y`.
- `order(y)` returns the order of elements in `y`, and this order is stored in vector `o`.
- `y[o]` retrieves the values of `y` in the order specified by `o`.

## Matrix

```R
# Create a matrix 'm' from the vector 'junk'
m = matrix(junk, ncol=3, byrow = TRUE)
# Print the matrix 'm'
print(m)
# Get the dimensions of the matrix 'm'
dim(m)
```
Explanation:
- A matrix `m` is created from the vector `junk` with 3 columns (`ncol=3`) and filled by rows (`byrow = TRUE`).
- The matrix `m` is printed.
- `dim(m)` returns the dimensions of the matrix `m`.
```R
# Extract column 1 of matrix 'm' into vector 'y'
y = m[,1]
# Extract row 2 of matrix 'm' into vector 'x'
x = m[2,]
# Extract element at row 1, column 2 of matrix 'm' into scalar 'z'
z = m[1,2]
# Print 'z'
print(z)
```

```R
# Create a new matrix 'new' with values 1 to 9 arranged in a 3x3 matrix
new = matrix(1:9,3,3)
# Print matrix 'new'
print(new)
```
Explanation:
- A new matrix `new` is created with values 1 to 9 arranged in a 3x3 matrix.
- The matrix `new` is printed.
```R
# Add scalar 'z' to matrix 'new'
hello = z + new
# Print the result
print(hello)
```
Explanation:
- `z + new` adds the scalar `z` to each element of the matrix `new`.
- The result is stored in the matrix `hello`, and it is printed.
```R
# Access element at row 1, column 3 of matrix 'm'
m[1,3]
# Extract the first column of matrix 'm'
m[,1]
# Access element at row 2, column 3 of matrix 'm'
m[2,3]
# Modify element at row 2, column 3 of matrix 'm' to be 7
m[2,3] = 7
# Extract columns 2 and 3 of matrix 'm'
m[,c(2,3)]
# Remove the second row from matrix 'm'
m[-2]
```

```R
# Create a vector 'x1' with values 1 to 3
x1 = 1:3
```
Explanation:
- A new vector 'x1' is created with values 1 to 3.
Please note that in the original code, there's a typo in the line `m = matric(junk, ncol=3, byrow = T)`. It should be corrected to `m = matrix(junk, ncol=3, byrow = T)`.