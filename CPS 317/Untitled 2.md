4. Write declarative statement to represent the following data items
 ```Fortran
 Integer :: number_of_students
 Character(len=6) :: gender
 Real:: average_score
 Character(len=120) :: house_address
 Real:: gravity_acceleration
```

5. Write a program to computer the volume of a sphere using the formula
 v = pi* r **2 * h

```Fortran
program SphereVolumeCalculator
  implicit none
  Real :: pi, radius, volume

  ! Define the value of pi
  pi = 3.142

  ! Input the radius of the sphere
  write(*,*) "Enter the radius of the sphere:"
  read(*,*) radius

  ! Calculate the volume of the sphere
  volume =   pi * radius**2 * h

  ! Output the result
  write(*,*) "The volume of the sphere is ", volume

end program SphereVolumeCalculator

```