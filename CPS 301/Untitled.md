Sure, let's briefly define each of these matrices with an example:

1. **Skew-Symmetric Matrix:**
   - Definition: A skew-symmetric matrix is a square matrix whose transpose is equal to its negative.
   - Example: 
$$
     A = \begin{bmatrix}
            0 & 2 & -3 \\
           -2 & 0 & 4 \\
            3 & -4 & 0
         \end{bmatrix}
     
$$

 Transpose of \(A\):
$$
      A^T = \begin{bmatrix}
            0 & -2 & 3 \\
            2 & 0 & -4 \\
            -3 & 4 & 0
          \end{bmatrix}
     

$$
     \(A\) is skew-symmetric because \(A^T = -A\).

2. **Hermitian Matrix:**
   - Definition: A Hermitian matrix is a complex square matrix that is equal to its own conjugate transpose.
   - Example:
$$
      B = \begin{bmatrix}
            3 & -i \\
            i & 2
          \end{bmatrix}
     
$$
     Conjugate transpose of \(B\):
$$
      B^* = \begin{bmatrix}
            3 & i \\
           -i & 2
          \end{bmatrix}
 
$$
     \(B\) is Hermitian because \(B = B^*\).

3. **Orthogonal Matrix:**
   - Definition: An orthogonal matrix is a square matrix whose transpose is equal to its inverse. In the context of complex numbers, the conjugate transpose is used.
   - Example:
$$
  C = \begin{bmatrix}
            \frac{1}{\sqrt{2}} & -\frac{1}{\sqrt{2}} \\
            \frac{1}{\sqrt{2}} & \frac{1}{\sqrt{2}}
          \end{bmatrix}
  
$$
     Transpose of \(C\):
$$
 C^T = \begin{bmatrix}
            \frac{1}{\sqrt{2}} & \frac{1}{\sqrt{2}} \\
           -\frac{1}{\sqrt{2}} & \frac{1}{\sqrt{2}}
          \end{bmatrix}
$$
     Inverse of \(C\):
$$
     C^{-1} = \begin{bmatrix}
            \frac{1}{\sqrt{2}} & \frac{1}{\sqrt{2}} \\
           -\frac{1}{\sqrt{2}} & \frac{1}{\sqrt{2}}
          \end{bmatrix}
$$
     \(C\) is orthogonal because \(C^T = C^{-1}\).