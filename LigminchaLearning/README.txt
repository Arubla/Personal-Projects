This program will allow users to quickly access review materials for the
various practices taught by Ligmincha. For now, the goal is to group all
prayer texts and related audio files by their lineage: Zhang Zhung Nyen Gyu,
Ma Gyu, and A Tri.

This readme outlines the steps I need to take to complete the program, for
my own review.

The classes I need:
Bon(abstract parent class), MaGyu(extends Bon), A Tri(extends Bon), ZZNG(extends Bon)
Prayers(extends the lineage class and implements interfaces(one class for each?))
The interfaces I need:
Hearable(for audio files), Readable(for text files) ** Maybe not? so many have both.
1. Bon
    a. It should have a name variable.
    b. It should have a Collection variable to hold its prayer resources.
2. Prayers(text or audio)
    a. Need a name variable
    b. need a file variable set to the file path (two if it's readable and hearable.
    c. need matching scanners for the file type
3. Setup
    a. contains a method that builds the classes at start.
4. Application
    a. provides a way of navigating amongst the content according to user input.

How can I make this modular, to just grab whatever files are in the library
and make objects from them?
