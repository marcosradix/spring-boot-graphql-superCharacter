# spring-boot-graphql-superCharacter
projeto graphql spring boot e mongodb

#allCharacters
{
  allCharacters {
    id
    name
    age
  }
}
#characterById(id: "")

{ 
  characterById(id: "5d9e5d3e276769052c9f4cfa") {
    name
    age
  }
}

#Mutation insert data
{
mutation{
  addCharacter(name: "Marcos Ferreira", age: 30){
    id
    name
  }
}

##Mutation insert group
mutation{
  addGroup(name: "TheGoodGuys", orientation: HERO)
  {name orientation}
}



