package pers.zzb.xcoin.study.blockchain;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ceshi
 * @Description: ${todo}
 * @date 2018/4/1214:19
 */
public class MerkleTreeTest {

    @Test
    public void getRootHash() {
        List<String> datas = Lists.newArrayList("a", "b", "c", "d", "e");
        MerkleTree merkleTree = new MerkleTree(datas);
        System.out.println(merkleTree.getRootHash());
    }
}