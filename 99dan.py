#!/bin/python
for row in range(1,10):
	sRow = ""
	for column in range(1,10):
		sRow = sRow + "%3d" % (row*column)
	print sRow
