import numpy as np
import pandas as pd
import sys
import re
import math

'''
Created on Apr 4, 2017

@author: sangeeta
'''

inputFile = sys.argv[1]
pickupLocX = float(sys.argv[2])
pickupLocY = float(sys.argv[3])
f = open(inputFile)
lines = f.readlines()[1:]
f.close()

graphList = list()
graphListPositions = list()

# removes null and newline characters from csv data, splits on ',' and creates a 2D array
for line in lines:
    if (line[0:1]==' '):
        line = line[1:]
    if (line.find('\n')!='-1'):
        line = line[0:line.find('\n')]
    lineList = re.split(r'[,]+',line)
    graphList.append(lineList) 


listX = [1]
listY = [2]
resultsX = [[l[i] for i in listX] for l in graphList]
resultsY = [[l[i] for i in listY] for l in graphList]

posResultList = list()

# calculate the distance from the pickup poit to every other location
for i in range(0,len(resultsX)-1):
    posResultList.append(math.sqrt((float(resultsX[i][0]) - pickupLocX)*(float(resultsX[i][0]) - pickupLocX)+(float(resultsY[i][0]) - pickupLocY)*(float(resultsY[i][0]) - pickupLocY)))
# fetch the index of the location which has the smallest distance
Index = posResultList.index(min(posResultList))

#get the data of the location of the index fetched in the last step
print("Best yard: ")
print("zip_code"+graphList[Index][0])
print("city"+graphList[Index][0])
print("state"+graphList[Index][0])
print("county"+graphList[Index][0])









