# JPCoffe DSL

A DSL for COOKS

![jpmeme](./jpmeme.jpg)

## Syntax sample

```
// Define a recipe
Recipe "Bechamel" {
  
  // Quantity
  For 6 people

  Ingredients
  ------------
  * Farine 50gr
  * Beurre 50gr
  * Lait 60cl
  * Sel

  Tools
  ------
  * Casserole a fond epais
  * Cuillere en bois
  * Rape

  Steps
  ------
  // For each step, you have to give the required predecessors steps
  // using the syntax {PRED_STEP_1, ...} -> STEP_NUMBER. TEXT
  { } -> 1. faire fondre le Beurre dans la Casserole a fond epais
  {1} -> 2. ajouter la Farine et remuer avec une Cuillere en bois
  {2} -> 3. verser le Lait progressivement en remuant jusqu'a ce que la sauce epaississe
  {3} -> 4. assaisonner de Sel, Poivre et Muscade rapee

}
```