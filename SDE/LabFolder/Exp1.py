# To perform EDA on a dataset using the Pandas library to understand the structure, quality and 
# statistical properties of data

import pandas as pd
#df = pd.read_excel("AIML_codes-/SDE/LabFolder/Students.xlsx ")
#print(df)
df1 = pd.read_excel("AIML_codes-/SDE/LabFolder/student.xlsx")
print(" ")
print(df1)
print(df1.shape)
print(df1.columns)
print(df1.dtypes)
print(df1.info())
print(df1.describe(include='all'))

