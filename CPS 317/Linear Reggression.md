Performing linear regression in R is a common task, and it can be accomplished using the built-in `lm()` function. Here's a step-by-step guide using a simple example:

Let's assume you have a dataset with two variables, `x` and `y`, and you want to fit a linear regression model to predict `y` based on `x`.

### 1. Generate Example Data:

```R
# Generate example data
set.seed(123)
x <- rnorm(100, mean = 10, sd = 2)
y <- 2 * x + rnorm(100, mean = 0, sd = 5)
```

### 2. Perform Linear Regression:

```R
# Fit linear regression model
model <- lm(y ~ x)

# Print summary of the model
summary(model)
```

### 3. Interpretation of Results:

After running the code, you will get a summary of the linear regression model, including coefficients, standard errors, t-values, and p-values. For example:

```R
Coefficients:
            Estimate Std. Error t value Pr(>|t|)    
(Intercept)  -1.7169     2.4794  -0.692    0.490    
x             2.0506     0.3084   6.643 1.14e-09 ***
```

- **Intercept:** The y-intercept of the regression line.
- **x:** The slope of the regression line.

In the above example, the estimated regression equation would be:

\[ \hat{y} = -1.7169 + 2.0506 \cdot x \]

### 4. Plotting the Regression Line:

```R
# Plot the data points
plot(x, y, main = "Linear Regression Example", xlab = "x", ylab = "y")

# Add the regression line to the plot
abline(model, col = "red")
```

This code will create a scatter plot of the data points and overlay the fitted regression line in red.

This is a basic example, and you can customize the regression analysis based on your specific dataset and research questions. The `lm()` function can handle more complex models and includes various options for diagnostics and model comparison.