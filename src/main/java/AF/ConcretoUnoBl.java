/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AF;

import AF.ChocolateBlanco;

/**
 *
 * @author edg-a
 */
public class ConcretoUnoBl implements ServFabricar{

    @Override
    public SerValidar Fabricar() {
        return new ChocolateBlanco();
    }
}
