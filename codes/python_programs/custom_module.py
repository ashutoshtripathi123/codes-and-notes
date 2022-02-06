import functions
import modules.custom_functions

tArea = functions.calc_triangleArea(2,3)
print('Area of triangle = ',tArea)

sArea = functions.calc_squareArea(2)
print('Area of Square = ',sArea)

print("Modules in another folder..........")
tArea = modules.custom_functions.calc_triangleArea(4, 6)
print('Area of triangle = ',tArea)

sArea = modules.custom_functions.calc_squareArea(4)
print('Area of Square = ',sArea)

# modules directory is kept in same folder as project, hence we can call it directory
# however if modules are kept outside of project folder then in that case we need to make the following changes
# import sys
# sys.path.append("path where external module is kept")
# import modules.custom_functions



