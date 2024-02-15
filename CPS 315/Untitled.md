The 3/8 Simpson's rule is a numerical integration method used to approximate the definite integral of a function. It is an extension of the regular Simpson's rule and is particularly useful when dealing with an odd number of intervals. The formula for the 3/8 Simpson's rule is given by:

\[ \text{Approximate Integral} = \frac{3h}{8} \left[ f(x_0) + 3f(x_1) + 3f(x_2) + 2f(x_3) + \ldots + 2f(x_{n-2}) + 3f(x_{n-1}) + f(x_n) \right] \]

Here, \( h \) is the width of each interval, and \( n \) is the number of intervals. The subscripts \( x_0, x_1, x_2, \ldots, x_n \) represent the equally spaced points on the x-axis.

Note that for the 3/8 Simpson's rule, the number of intervals \( n \) must be a multiple of 3. If the total number of intervals is not a multiple of 3, you may need to use a different method for the last few intervals, such as the trapezoidal rule.


$$ \text{Approximate Integral} = \frac{3h}{8} \left[ y_0 + 3\{\text{all values of y from } y_1 \text{ to } yn-1\} - \{\text{multiples of three }\} + y_n\right] $$
$$ \text{Approximate Integral} = \frac{3h}{8} \left[ y_0 + 3\{ y_1+ y_2+ y_3 + y_4 \ldots  + y_{n-1}\} - \{y_3+ y_6+y_9 \ldots  + y_{n-3}\} + y_n\right] $$
