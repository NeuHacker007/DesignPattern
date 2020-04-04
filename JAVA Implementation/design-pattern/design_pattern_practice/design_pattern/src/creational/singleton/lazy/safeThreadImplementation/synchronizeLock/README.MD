Synchronization key word brings a huge performance cost 
since adding lock and remove lock cost a lot. At same time, the way
we lock the static member in the class which will results in the 
whole class been locked. This local scope is too large.