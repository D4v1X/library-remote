/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

import javax.ejb.Remote;
import nodrawable.Ranking;
import nodrawable.Score;

/**
 *
 * @author davidsantiagobarrera
 */
@Remote
public interface ScoreBeanRemote {

    Ranking saveScore(Score score);
    
}
