function print()
{
    document.getElementById("1").innerHTML="Changed";
}
let school={
    name:"Sarasada high school",
    location:"Sarasada",
    established:1972,
    displayInfo:function(){
        console.log('${school.name} was  established in ${school.established} at ${this.location}');
    }
}
school.displayInfo();
const arr=[1,2,3,4,5];
document.write(typeof(arr));