import pyttsx3
import os
from datetime import datetime
from playsound import playsound
import webbrowser
chiti=pyttsx3.init()
class Robot:
    name="Chiti"
    def ___init__(self,n):
        self.name=n
    
    def On():
        chiti.say("Hello boss i am your personal assistant ")
        chiti.runAndWait()
        h=datetime.now()
        hou=h.strftime("%H")
        min=h.strftime("%M")
        sec=h.strftime("%S")
        if(hou<="0" or hou>="12"):
            chiti.say("good morning boss")
            chiti.say(f"time is {hou,min,sec}")
            chiti.runAndWait()
        elif(hou<="12" or hou>="17"):
            chiti.say("good afternoon boss")
            chiti.say(f"time is {hou,min,sec}")
            chiti.runAndWait()
        elif(hou<="18" or  hou>="20"):
            chiti.say("good evening boss")
            chiti.say(f"Time is {hou,min,sec}")
            chiti.runAndWait()
    def Calculator():
         chiti.say("enter the number boss")
         chiti.runAndWait()
         print("Enter the number")
         num=int(input())
         chiti.say("enter the second number boss")
         chiti.runAndWait()
         print("Enter the second number")
         n=int(input())
         chiti.say("enter the operator boss")
         chiti.runAndWait()
         print("Enter the operator")
         choose=input()
         if(choose=="+" or choose== "add"):
             res=num+n
             chiti.say(res)
             chiti.runAndWait()
             print(num," + ",n," = ",res)
         if(choose=="-" or choose=="sub"):
             res=num-n
             chiti.say(res)
             chiti.runAndWait()
             print(num," - ",n," = ",res)
         if(choose=="x" or choose=="*" or choose=="multiply"):
             res=num*n
             chiti.say(res)
             chiti.runAndWait()
             print(num," x ",n," = ",res)
         if(choose=="/" or choose=="div"):
             res= num/n
             chiti.say(res)
             chiti.runAndWait()
             print(num," / ",n," = ",res)
    def Agecalculator():
        print("Enter the born year")
        by=int(input())
        print("Enter the current year")
        cy=int(input())
        p=cy-by
        print("your age ",p)
        chiti.say(f"your age is {p}")
        chiti.runAndWait()
    def HalfPyrmoid(row):
        for i in range(0,row,1):
            for column in range(0,i+1 ,1):
                print("#",end=" ")
            print()


Robo=Robot()
Robot.On()
bol=True

while bol:
     
    print("Listening..........")
    ch=input()
    if(ch=="off"):
        print("Bye boss")
        chiti.say("bye boss")
        chiti.runAndWait()
        bol=False
    if(ch=="chiti do calculation"):
        chiti.say("okay boss")
        chiti.runAndWait()
        Robot.Calculator()
    if(ch=="chiti do age calculator"):
        chiti.say("okay boss")     
        chiti.runAndWait()
        Robot.Agecalculator()
    if(ch=="chiti restart pc"):
        chiti.say("restarting.........")
        chiti.runAndWait()
        os.system("shutdown /r /t 5")
    if(ch=="chiti draw half pyramid"):
        chiti.say("how many rows you want boss")
        chiti.runAndWait()
        print("How many row you want boss?")
        row=int(input())
        Robot.HalfPyrmoid(row)
        chiti.say("done boss")
        chiti.runAndWait()
    if(ch=="chiti play my song"):
        webbrowser.open("https://www.youtube.com/watch?v=Zng4j69y5Uk")
    if(ch=="chiti shutdown pc"):
        chiti.say("shutdown pc")
        chiti.runAndWait()
        os.system("shutdown /s /t 0")
