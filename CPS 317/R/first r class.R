#creating a function f
f = function(x,y) {x+y}
f(2,3);f(1.5,-0.7);f(4,10)

g = function(x,y=10){x+y}
g(1) 

q = function(x){return(x^2 + 3)}

x = c(1,2,3,4,5)
vectorMean = function(x) {sum(x) / length(x)}

vectorMean(x)

#using built-in function
mean(x)


x = c(1,2,4,5,6)
y = c(2,4,6,7,8)
meanDiff = function(x,y){a = mean(x) - mean(y); return(a)}
meanDiff(x,y)



mx = function(x){
  x = x + 5
  cat("The new x is:", x)
}


geometric = function(x){exp(mean(log(x)))}
geometric(x)

z = runif(50,0,3)


for(i in 1:10){
  print(i+1)
}



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



for(i in 1:10){
  for(j in 1:5){
    cat("i: ",i," j: ",j)
  }
}

for(i in 1:10){
  if(i == 4){
    print(i)
  }
}

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

geometric = function(x) {
  if(!is.numeric(x)) stop ("Input must all be numeric")
  if(min(x) <= 0 ) stop ("Input must be greater than zero")
  
  exp(mean(log(x)))
}
x = c("a","b","c")
y = c(1,2,3,4)
geometric(y)
geometric(x)