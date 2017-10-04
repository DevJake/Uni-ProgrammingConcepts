/*
 * Copyright 2017 Jake Dean
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.winterbe.expekt.should
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.context
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

/**
 * Performs a range of unit tests for the
 * a la Russe multiplication method.
 */
class aLaRusseTest : Spek({
    context("legal values") {
        on("multiplying 4 * 4") {
            it("should return 16") {
                aLaRusse.mult(4, 4).should.equal(16)
            }
        }

        on("multiplying 4 * 32") {
            it("should return 128") {
                aLaRusse.mult(4, 32)
            }
        }

        on("multiplying 32 * 32") {
            it("should return 1024") {
                aLaRusse.mult(32, 32).should.equal(1024)
            }
        }

        on("multiplying 64 * 1") {
            it("should return 64") {
                aLaRusse.mult(64, 1).should.equal(64)
            }
        }

        on("multiplying 64 * 0") {
            it("should return 0") {
                aLaRusse.mult(64, 0).should.equal(0)
            }
        }

        on("multiplying 0 * 0") {
            it("should return 0") {
                aLaRusse.mult(0, 0).should.equal(0)
            }
        }
    }

    context("illegal values") {
        on("multiplying 32 * -1") {
            it("should return 0") {
                aLaRusse.mult(32, -1).should.equal(0)
            }
        }

        on("multiplying 32 * -1") {
            it("should return 0") {
                aLaRusse.mult(32, -1).should.equal(0)
            }
        }

        on("multiplying -4 * -1") {
            it("should return 0") {
                aLaRusse.mult(-4, -1).should.equal(0)
            }
        }
    }
})