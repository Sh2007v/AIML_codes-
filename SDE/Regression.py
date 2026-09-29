# import pandas as pd
# from sklearn.model_selection import train_test_split
# from sklearn.linear_model import LinearRegression

# data = {
#     'Hours_Studied' : [2,3,4,5,6,7,8,9,10,11],
#     'Attendance' : [60,55,60,52,85,40,62,65,10,25],
#     'Marks' : [45,50,55,60,65,70,75,80,88,92]
# }

# df = pd.DataFrame(data)
# print(df)
# X = df['Marks']
# #Splitting dataset
# X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.2,random_state = 42)
# print("Before training:",X_train)
# print("Before training :\n",y_test)


import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

data = {
    'Hours_Studied' : [2,3,4,5,6,7,8,9,10,11],
    'Attendance' : [60,55,60,52,85,40,62,65,10,25],
    'Marks' : [45,50,55,60,65,70,75,80,88,92]
}

df = pd.DataFrame(data)
print(df)
X = df[['Marks']]
y = df['Marks']
#Splitting dataset
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.2,random_state = 42)
print("Before training:",X_train)
print("Before training :\n",y_test)
print(X.shape)
print(y.shape)

#Create and train model
model = LinearRegression()
model.fit(X_train,y_train)

#Testing

testing = [[5.5]]
y_pred = model.predict(test)