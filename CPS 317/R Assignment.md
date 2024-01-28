
1. Write the r function name of the following statistical distribution
2. Binomial:
```R
dbinom(success,size,probability)
# Probability of getting exactly 3 heads in 5 coin tosses with a fair coin
 probability <- dbinom(3, size = 5, prob = 0.5)
```
	
1. Poisson
```R
#calculates the probability mass function
dpois(k,lambda)
# Probability of observing 2 events in a Poisson distribution with mean 3 
dpois(2, lambda = 3)
```

1. Uniform
```R
#Calculates the probability density function, which gives the probability of observing a specific value in the uniform distribution.
dunif(x, min, max)
dunif(3, 1, 5)
```
	1. Beta distribution
```R
dbeta(x,shape,shape2)
pbeta(q,shape1,shap2)

dbeta(0.5, 2, 5) # Probability density at x=0.5 in a Beta distribution with shape parameters 2 and 5
pbeta(0.8, 2, 5) 
# Cumulative probability up to x=0.8 in a Beta distribution with shape parameters 2 and 5
```
	2. Normal distribution
```R
dnorm(x,mean,sd)
pnorm(q,mean,sd)

dnorm(0, mean = 2, sd = 1) # Probability density at x=0 in a normal distribution with mean 2 and standard deviation 1

pnorm(1.5, mean = 2, sd = 1) # Cumulative probability up to x=1.5 in a normal distribution with mean 2 and standard deviation 1
```
	3. Weibull distribution
```R
dweibull(x,shape,scale)
pweibull(q,shape,scale)

dweibull(2, shape = 2, scale = 1) # Probability density at x=2 in a Weibull distribution with shape parameter 2 and scale parameter 1

pweibull(3, shape = 2, scale = 1) # Cumulative probability up to x=3 in a Weibull distribution with shape parameter 2 and scale parameter 1
```
	4. Gamma distribution
```R
dgamma(x,shape,rate)
pgamma(q,shape,rate)

dgamma(3, shape = 2, rate = 1) # Probability density at x=3 in a Gamma distribution with shape parameter 2 and rate parameter 1

pgamma(4, shape = 2, rate = 1) # Cumulative probability up to x=4 in a Gamma distribution with shape parameter 2 and rate parameter 1
```
5. Geometric Distribution
```R
dgeom(x,prob)
pgeom(q,prob)

dgeom(3, prob = 0.3) # Probability of observing 3 failures before the first success in a geometric distribution with success probability 0.3

pgeom(2, prob = 0.3) # Cumulative probability up to 2 failures before the first success in a geometric distribution with success probability 0.3
```
	6. Hyper geometric
```R
dhyper(x,m,n,k)
phyper(q,m,n,k)

dhyper(2, m = 10, n = 15, k = 5) # Probability of observing 2 successes in 5 draws without replacement from a population of 15 with 10 successes

phyper(3, m = 10, n = 15, k = 5) # Cumulative probability up to 3 successes in 5 draws without replacement from a population of 15 with 10 successes
```
	8. Lognormal distribution
```R
dlnorm(x,meanlog,sdlog)
plnorm(q,meanlog,sdlog)

dlnorm(1, meanlog = 0, sdlog = 1) # Probability density at x=1 in a lognormal distribution with log-mean 0 and log-standard deviation 1 

plnorm(2, meanlog = 0, sdlog = 1) # Cumulative probability up to x=2 in a lognormal distribution with log-mean 0 and log-standard deviation 1
```

3. Consider the set of data 0,1,1,2,3,4,5,8,13,21,34. Write a simple r code to compute the mean, median, standard deviation and variance. Furthermore in the same code generate another variable from the set of data , by incrementing each data point by 1 and then taking logarithm of the point. For the new data set compute the correlation and covariance of the two data sets.  
```R
x = c(0,1,1,2,3,4,5,8,13,21,34); summary(x); sd(x); var(x); y = numeric(length(x)); for(i in 1:length(x)) {y[i] = log(x[i]+1)} ; cor(x,y);cov(x,y)
```



1. Using the following scores obtained from a test 26, 20, 22, 19,22,15,21,20,25,26,17,24,16,23,29. Write a single R code compute the following, summary statics, quartiles q1,q2,q3,q4. (z or t) standard score. test that the mean score is different from 0. test that the mean score is different from the mean of the data. Test that the mean score is the same as the mean of the data. Test that the score is normal -3 and +3 .  

```R
	x = c(26, 20, 22, 19,22,15,21,20,25,26,17,24,16,23,29);summary(x);q1 = quantile(x,0.25); q2 = quantile(x,0.5); q3 = quantile(x,0.75) ; q4 = q3 - q1 ; t_score = t.test(data)$statistic; all.equal(mean(x),0);shapiro.test(x);
```