package require Tk
wm title . "Ball"
set w 500
set h 500
canvas .c -width $w -height $h
pack .c
set state 1
.c create oval 200 200 250 250 -fill blue -tags ball
after 1000 animate

proc animate {} {
    global state
    if {$state == 1} {
        set state 0
        .c itemconfigure ball -fill red
    } else {
        set state 1
        .c itemconfigure ball -fill blue
    }
    after 1000 animate
}

