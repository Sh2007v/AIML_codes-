# To perform EDA on a dataset using the Pandas library to understand the structure, quality and 
# statistical properties of data

import pandas as pd
#df = pd.read_excel("AIML_codes-/SDE/LabFolder/Students.xlsx ")
#print(df)
#df1 = pd.read_excel("AIML_codes-/SDE/LabFolder/student.xlsx")
# print(" ")
# print(df1)
# print(df1.shape)
# print(df1.columns)
# print(df1.dtypes)
# print(df1.info())
# print(df1.describe(include='all'))

# print(df1.isnull().sum())
# print(df1.dropna(inplace=True))
# print(df1.fillna(0))
# print(df1.fillna(df1.mean(numeric_only=True),inplace=True))
# print(df1.duplicated().sum())
# print(df1.drop_duplicates(inplace=True))

#df_2 = df1[['RollNo','Marks1']]
# print(df_2)
# print(" ")
# print(df1['Marks1']>90)
# print(df1[df1['Marks1']>90])
# print(df1[df1['Marks1']>80])
# print(df1[df1['Group']=='G1'])
# print(" ")
# print(df1.sort_values(by='Marks1'))
# print(" ")
# print(df1.sort_values(by='Marks1',ascending=False))

# print(df1['Group'].value_counts())
# print(df1.groupby('Group')['Marks1'].mean())
# #print(df1.groupby('Group')['Marks1'].agg['mean','max','min','count','mode'])
# print(df1.loc[2])
# print(df1.loc[2,'Marks1'])
# df1.loc[0,'Marks1'] = 85
# print(df1)

# df1.loc[df1['RollNo'] == 103,'Marks1'] = 85
# print(df1)

# print(df1.iloc[2])
# print(df1.iloc[2,3])
# print(df1.iloc[0:3])
# print(df1.iloc[0:2,0:3])
#print(df1.iloc[2,3] = 56)

df3 = pd.read_excel("AIML_codes-/SDE/LabFolder/Diabetes_data.xlsx ")
print(df3)
print(df3.corr(numeric_only = True))








