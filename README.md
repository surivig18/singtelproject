# Singtel project

Project to demonstrate object modelling and instantiation
The project has been created as a Maven project including jngunit for testi

Object definitions
1. Interface Animal – Base interface extends the HelperInterfaces  deafult methods for default behaviour
2. Helper interfaces FlyInterface,SingInterface,SwimInterface,TransformingButterfly - Animal extends these interfaces 
3. Abstract classes Mammals,Bird,Fish - implements Animal and overrides the activities which Animals cannot perform ex. Fish cannot fly, so it overrides the implementation of fly in Animal interface
4. Dog, Cat - type of Mammals so extends and adds their specific activities
5. ClownFish, Shark - type of Fishes so extends and adds their specific activities
6. Chick, Bird, Parrot - type of Birds so extends and adds their specific activities
7. Rooster - has a relationship with Chicken, since its a Male chicken
8. Dolphin - not specific to Animal, implements SwimInterface for utilizing swim functionality
9. Butterfly - implements TransformingButterfly to add walk functionality if its a transformed Animal and implements FlyInterface to add flying, if its just a normal butterlfy

Object creation
1. AbstractFactory pattern for instanstiating the objects 
2. FactoryPattern for instating Parrot object 

Test class 
SolutionTest - tests instance creation and other functionlities of each Animal
