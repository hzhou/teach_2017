import math

from Tkinter import *
win_main = Tk()
x0 = 250
y0 = 250
theta=0.0
C = Canvas(win_main, width=500, height=500)
ball = C.create_oval(x0+100, y0, x0+100+20, y0+20, fill='gray20')
C.pack()
C.config(background='#eeee00')
def animate():
    global theta
    theta+=0.05
    x = x0 + 100 * math.cos(theta)
    y = y0 + 100 * math.sin(theta)
    C.coords(ball,x, y, x+20, y+20)
    win_main.after(1000/30, animate)
animate()
win_main.mainloop()
