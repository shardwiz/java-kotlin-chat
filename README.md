## What is this repository for :question:
#### Simple Application with one to one connectivity using Firebase Real time Database written in MVC,MVP and MVVM architecture to better understand the android coding patterns. Purpose of writing same application functionality with 3 different patterns is to show how a single application can be developed using 3 different patterns(Mvc, Mvp, Mvvm) :relieved:.

<br><br><br>

<p align="center"><img src="https://github.com/saksham24/Android-Firebase-Mvp-Mvc-Mvvm-chat/blob/master/Chatmvc - Java/chat.jpg" width="50%"><br>

<br><br><br>

## Mvc (Model View Controller)   :part_alternation_mark: :heavy_check_mark: C
Mvc is a clean approach in android putting the views away from the controller. The controller is only responsible for updating the models, once the model gets updated it can notify the views and then the views can be updated using proper callbacks.
Traditional MVC is where there is a

**Model** : Acts as the model for data<br>
**View** : Deals with the view to the user which can be the UI<br>
**Controller** :Controls the interaction between Model and View, where view calls the controller to update the model. A view can call multiple controllers if needed..
<br> <br>

## Mvp (Model View Presenter)  :part_alternation_mark: :heavy_check_mark: :parking:
Some disadvantages of MVC can be overcome using Mvp approach. Presenter in Mvp contains all the business logic and this class is far away from android Context or any other android related dependencies which provides a flexibility to text the business logic by simply using presenter class in the test modules. Android related dependencies create complexities in the testing. The presenter does not have any android dependencies like Context, View etc. All the model updates and network requests are done via presenter. Once the model gets updated or a network request completes, the view is updated via presenter using callbacks to the view from the presenter. No model and network request can directly approach views.
<br> <br>

## Mvvm (Model View View-Model)  :part_alternation_mark: :heavy_check_mark: :heavy_check_mark: :part_alternation_mark:
MVVM involves a data binding approach to make the code shorter and reduce the view handling code from Java/Kotlin classes. View models are responsible for updating the view. Once a view model is tied to a view then the view get notified about their updating events. If a model gets updated by a user click, it sends a callback to the ViewModel, which updates the view automatically since it is directly tied to it. Mvvm reduces code size but the implementation of MVVM is quite tricky as compared to MVC and MVP. It is difficult to debug big projects based on Mvvm too.
<br><br>
<br><br>

<img src="https://github.com/saksham24/Android-Firebase-Mvp-Mvc-Mvvm-chat/blob/master/Chatmvc - Java/layer-1.png" width="150%"><br><br>
<br><br>
<img src="https://github.com/saksham24/Android-Firebase-Mvp-Mvc-Mvvm-chat/blob/master/Chatmvc - Java/compare.png" width="150%"><br><br>
## Choice of correct architect
:eyes:
<br>
**Choice of a correct architecture** for the project involves the understanding of the modules which needs to be developed. Some functionalities works great on MVC, some with Mvp and some with Mvvm. It is quite difficult to debug the big projects made on MVVM specially those which doesn't have one sided data flow due to data binding. If an application receives a continuous data stream from a source, needs a regular UI-update and has majorly(80–90%) one sided communication(eg: an electronic devices sending logs to a android app) like solar-cell apps, inverters apps, or any other device's status monitoring can work well with MVVM. Debugging these MVVM applications can be easy as **major flow of data is one sided**.

MVP is a good approach for writing android projects when we are concerned about testing the business logic w.r.t the unit testing specially via JAVA test frameworks(Not Android). Since **JAVA test framework** will only resolve the java dependencies and a clean presenter layer is free from all the android related dependencies like context, sharedpreferences, or any other **com.android.*** package. Drawback of MVP is that it ends up writing **20-25% extra code** with the same functionality written in MVC or MVVM. Mvp is good if you are really interested in test cases and unit testing of the modules.
For MVP using java test kits just make instance of presenter and run test functions.
<br> <br>
eg: **new Presenter().testSomeFunction()**.

Mvc is widely used technique in android. Google itself wrote its repositories in MVC for many years until 2021. Now a days google is adopting MVVM for its github repositories as these repo's are small and majorly samples. MVC application can be tested via android test frameworks not with JAVA specific test tools due to lack of dependencies of **com.android.*** **packages** in java specific tool.

**Example**:
1. A chat application can be writtten in MVC, MVP, MVVM depending on testing requirements and flow of data.
2. A Luminous inverter monitoring application can work best with MVVM due to majorly one sided data flow.
3. E-commerce application can be build in MVC, MVP but MVVM may make some modules very complex.

**NOTE**: There is no single architecture which is best of all. If there was one, there wouldn't be any need of learning other architectures. Choice of correct architecture depends on several factors like initial requirements, data flow, scalability, maintenance, updates(CRs), testing requirements.

Except these three android architectures, there is one more architecture named as **"MVI** - Model view Intent". This is not very popular among Android developers. Please check this link if you are interested in **MVI**.
<br>https://github.com/saksham24/Android-simple-MVI-pattern-with-MVP-MVVM-collaboration
<br><br><br> 
# END     :warning:
